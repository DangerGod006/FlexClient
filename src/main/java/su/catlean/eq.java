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
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/eq.class */
public final class eq extends _g {

    @NotNull
    public static final eq o;
    static final KProperty[] S;

    @NotNull
    private static final cw i;

    @NotNull
    private static final c8 T;

    @NotNull
    private static final c8 E;

    @NotNull
    private static final bg I;
    private static final long a = yz.a(-713173467801877902L, 6393742044958412619L, MethodHandles.lookup().lookupClass()).a(109711385825995L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    /* JADX WARN: Illegal instructions before constructor call */
    private eq(long j) {
        long j2 = a ^ j;
        super((String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27155, 223204794039550644L ^ j2) /* invoke-custom */, jt.d(), null, 4, null, j2 ^ 31260825366612L);
    }

    private final m_ n(long j) {
        return (m_) i.E(this, (a ^ j) ^ 84071481821679L, S[0]);
    }

    private final int v(long j) {
        return ((Number) T.E(this, (a ^ j) ^ 107354210272209L, S[1])).intValue();
    }

    private final int g(short s, long j) {
        return ((Number) E.E(this, (((((long) s) << 48) | ((j << 16) >>> 16)) ^ a) ^ 3949170010716L, S[2])).intValue();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:40:0x0150
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    public final void X(@org.jetbrains.annotations.NotNull su.catlean.api.event.events.render.Render2DEvent r9) {
        /*
            Method dump skipped, instruction units count: 659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.eq.X(su.catlean.api.event.events.render.Render2DEvent):void");
    }

    static {
        int i2;
        long j = a ^ 130885443491714L;
        long j2 = j ^ 39572543546110L;
        long j3 = j ^ 81712474879759L;
        long j4 = j ^ 84832632902956L;
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[11];
        int i4 = 0;
        String str = "E0ª\u0016N\u0000`1\u0094vÄ<¹òd¥ ¨b\u0003j\u0090É-ßHG\u0088ðò\u0099¦\u001auq}\u000eûÉ³b\b\u0007#\u0001ÿÿË§\u0010oè\u008b/%\u0017Q\u007fÎd£®~K¦\u0018\u0018èú\u0015\u0082ÆA\u0096¼\u0015\u0010Qá)xÂÖ:´ëßR\u00ado\u0081 \u0003bz+aÿ×9h¶A\u0097x¹ötý\u0098\u00907ë\u0098Q°Â\u008e¤µaÇ?\u0091\u0010Éó\u0015PQ\u009cAtÚ,/vÎ\u009bÖ\u0001 nXñTiX\b÷6Z&\u0083\u0083!\u0096\u0094¸\u0013\u008dC^|SnAI+SÔ½Q²\u0018íÎ\u00199\u0010òz\u009d2ò\u0006\u0094x\u0000:çM\u0002/Z\"\npß8ÌI»^|/Í\u000eé\u0081\u00ad\u0099ð\u0083®ß\u009c¼\n\b?æ\u008d\u0084J\u0011³\rÞ,$ò©Ö°\u0086Bc\füdå\u001d¼´QeË\u0002zz_æ¢\u0017I";
        int length = "E0ª\u0016N\u0000`1\u0094vÄ<¹òd¥ ¨b\u0003j\u0090É-ßHG\u0088ðò\u0099¦\u001auq}\u000eûÉ³b\b\u0007#\u0001ÿÿË§\u0010oè\u008b/%\u0017Q\u007fÎd£®~K¦\u0018\u0018èú\u0015\u0082ÆA\u0096¼\u0015\u0010Qá)xÂÖ:´ëßR\u00ado\u0081 \u0003bz+aÿ×9h¶A\u0097x¹ötý\u0098\u00907ë\u0098Q°Â\u008e¤µaÇ?\u0091\u0010Éó\u0015PQ\u009cAtÚ,/vÎ\u009bÖ\u0001 nXñTiX\b÷6Z&\u0083\u0083!\u0096\u0094¸\u0013\u008dC^|SnAI+SÔ½Q²\u0018íÎ\u00199\u0010òz\u009d2ò\u0006\u0094x\u0000:çM\u0002/Z\"\npß8ÌI»^|/Í\u000eé\u0081\u00ad\u0099ð\u0083®ß\u009c¼\n\b?æ\u008d\u0084J\u0011³\rÞ,$ò©Ö°\u0086Bc\füdå\u001d¼´QeË\u0002zz_æ¢\u0017I".length();
        char cCharAt = 16;
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
                            b = strArr;
                            c = new String[11];
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[7];
                            int i10 = 0;
                            String str3 = "\u009eQjT©Û7\rq©kC)\u0010\fP\u008bÅÁ\u0095\u0081º¸¸êÅ\u0096\u001aò\u000f\u001eX¹*¿ý\u009cÐêS";
                            int length2 = "\u009eQjT©Û7\rq©kC)\u0010\fP\u008bÅÁ\u0095\u0081º¸¸êÅ\u0096\u001aò\u000f\u001eX¹*¿ý\u009cÐêS".length();
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
                                                S = new KProperty[]{Reflection.property1(new PropertyReference1Impl(eq.class, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21213, 6582535714134225840L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23590, 3123609834757258570L ^ j) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(eq.class, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16042, 2902126312206639052L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1285, 3884328052404102242L ^ j) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(eq.class, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15498, 2645124121708568040L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14946, 9133600074470726401L ^ j) /* invoke-custom */, 0))};
                                                o = new eq(j3);
                                                i = yp.L(o, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18809, 6327895547647748120L ^ j) /* invoke-custom */, m_.LEFT, null, null, (int) jArr[6], null, j4);
                                                T = yp.L(o, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22273, 7133164691438630511L ^ j) /* invoke-custom */, (int) jArr[1], new IntRange(0, (int) jArr[5]), j2, null, null, (int) jArr[3], null);
                                                E = yp.L(o, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6262, 4779659091522533651L ^ j) /* invoke-custom */, (int) jArr[4], new IntRange(0, (int) jArr[0]), j2, null, null, (int) jArr[2], null);
                                                I = new bg();
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j7;
                                            if (i11 >= length2) {
                                                str3 = "\r\u000f~U^Í»\u0084ÂE;\u0082HCl[";
                                                length2 = "\r\u000f~U^Í»\u0084ÂE;\u0082HCl[".length();
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
                        str = "MÌ\n\u0018\u009b÷wB\u0089ÿ´pVÑã3\u0010\u0011\u0000Ëú\u0018¸ß\"\b`ëM\u001cÙÌ÷";
                        length = "MÌ\n\u0018\u009b÷wB\u0089ÿ´pVÑã3\u0010\u0011\u0000Ëú\u0018¸ß\"\b`ëM\u001cÙÌ÷".length();
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
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 18478;
        if (c[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) d.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                c[i3] = b(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/eq", e);
            }
        }
        return c[i3];
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
            r1 = 4
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
            java.lang.String r1 = "su/catlean/eq"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.eq.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
