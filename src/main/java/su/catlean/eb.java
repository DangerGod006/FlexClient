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
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/eb.class */
public final class eb extends _g {

    @NotNull
    public static final eb t;
    static final KProperty[] j;

    @NotNull
    private static final cq C;

    @NotNull
    private static final cq c;
    private static final long a = yz.a(-3001214006639270293L, -870175250357964846L, MethodHandles.lookup().lookupClass()).a(101105687219904L);
    private static final String[] b;
    private static final String[] d;
    private static final Map e;

    /* JADX WARN: Illegal instructions before constructor call */
    private eb(long j2) {
        long j3 = a ^ j2;
        super((String) b(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29594, 1087808546457492736L ^ j3) /* invoke-custom */, jt.v(), null, 4, null, j3 ^ 48866330553273L);
    }

    private final boolean w(long j2) {
        return ((Boolean) C.E(this, (a ^ j2) ^ 104028470593610L, j[0])).booleanValue();
    }

    private final boolean h(long j2) {
        return ((Boolean) c.E(this, (a ^ j2) ^ 11789349111515L, j[1])).booleanValue();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:26:0x00a4
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void i(su.catlean.api.event.events.network.SendPacket r9) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.eb.i(su.catlean.api.event.events.network.SendPacket):void");
    }

    static {
        int i;
        long j2 = a ^ 65596006072990L;
        long j3 = j2 ^ 126314475719746L;
        long j4 = j2 ^ 60387841178110L;
        e = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j2 << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[8];
        int i3 = 0;
        String str = "\u0005&\u008fêqUçÞªª÷ÙHÛ©OÃ\u0089Üã\r.D@  &¸O3NuÈ\u0091qæ tv\u0010Jó\u00ad©mÊ&\u0081£\u0018\u0016s[\u0085æ\u0002¾\u0010\u001e\u0016Î¨geË¯\u009f\u009bþ\u0010a\\½· ¤\u008eÛ\fî¡¾Êº©\u0007å¡,`¡Z\u0012\u008fÍ\u0098á\u008d\u0085+»±e4\u007fK\u008aT~yÕ\u0006\u0099&nÊ©\u0090øn\tr\u0015\u0019!á«\u008e»\u0012\u0001ãëÍyï\u0007¢: øÅUÙöæý2EñoJ)í£\b\u0080EJ\u0096CÄú2\nBrþ\u0090Èúó\u001aMdz^\u0016Z\u0013II\u0089ÕqHU_\u0002\u008cPr7^\u008f\u0086ÚS\u0013Yj\u0014«lpÍ¹ýÐB\u0016>Y\u009bmÑøÐLÝ\u0005/$Q\u0019Þ\u000fSá¹÷\u0081ð»\u008c\u0018ú\u0086\u0082Õ\"´h¾ú4|¤ñ\u0090\u009aX|\u0084´ø¢-\u009a_ \u008f4i\u009fGÞo¼\u0014L\u0084\u009dYöo7B\u0006Ò·\u0007á\u009f51o\u008a!%ß\u0002Ù";
        int length = "\u0005&\u008fêqUçÞªª÷ÙHÛ©OÃ\u0089Üã\r.D@  &¸O3NuÈ\u0091qæ tv\u0010Jó\u00ad©mÊ&\u0081£\u0018\u0016s[\u0085æ\u0002¾\u0010\u001e\u0016Î¨geË¯\u009f\u009bþ\u0010a\\½· ¤\u008eÛ\fî¡¾Êº©\u0007å¡,`¡Z\u0012\u008fÍ\u0098á\u008d\u0085+»±e4\u007fK\u008aT~yÕ\u0006\u0099&nÊ©\u0090øn\tr\u0015\u0019!á«\u008e»\u0012\u0001ãëÍyï\u0007¢: øÅUÙöæý2EñoJ)í£\b\u0080EJ\u0096CÄú2\nBrþ\u0090Èúó\u001aMdz^\u0016Z\u0013II\u0089ÕqHU_\u0002\u008cPr7^\u008f\u0086ÚS\u0013Yj\u0014«lpÍ¹ýÐB\u0016>Y\u009bmÑøÐLÝ\u0005/$Q\u0019Þ\u000fSá¹÷\u0081ð»\u008c\u0018ú\u0086\u0082Õ\"´h¾ú4|¤ñ\u0090\u009aX|\u0084´ø¢-\u009a_ \u008f4i\u009fGÞo¼\u0014L\u0084\u009dYöo7B\u0006Ò·\u0007á\u009f51o\u008a!%ß\u0002Ù".length();
        char cCharAt = 24;
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            String strSubstring = str.substring(i5, i5 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i6 = i3;
                        i3++;
                        strArr[i6] = strIntern;
                        int i7 = i5 + cCharAt;
                        i = i7;
                        if (i7 >= length) {
                            b = strArr;
                            d = new String[8];
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j2 << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[2];
                            int i9 = 0;
                            int length2 = ">Õþ\u009c\u0087ªyÃ\u0087Q\u000eiéº\u0096\u001c".length();
                            int i10 = 0;
                            do {
                                int i11 = i10;
                                i10 += 8;
                                byte[] bytes = ">Õþ\u009c\u0087ªyÃ\u0087Q\u000eiéº\u0096\u001c".substring(i11, i10).getBytes("ISO-8859-1");
                                i9++;
                                byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (r2 >>> 56), (byte) (r2 >>> 48), (byte) (r2 >>> 40), (byte) (r2 >>> 32), (byte) (r2 >>> 24), (byte) (r2 >>> 16), (byte) (r2 >>> 8), (byte) (((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255))});
                                jArr[-1] = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                            } while (i10 < length2);
                            j = new KProperty[]{Reflection.property1(new PropertyReference1Impl(eb.class, (String) b(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21092, 6020192108156062988L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4480, 4821972967274598127L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(eb.class, (String) b(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29647, 2547481922953522338L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3597, 9175162990415761766L ^ j2) /* invoke-custom */, 0))};
                            t = new eb(j4);
                            C = yp.t(t, (String) b(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(739, 2765709621590875530L ^ j2) /* invoke-custom */, true, j3, null, null, (int) jArr[0], null);
                            c = yp.t(t, (String) b(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17870, 908766841945954976L ^ j2) /* invoke-custom */, true, j3, null, null, (int) jArr[1], null);
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
                        str = "\u0087º\u0015E°^öGs\u009dh\u008e\u009f/ó\u0091Ïhç¬tf\u0001a\u0006uò}ØÖQÐ\u0010ºÑ»\u008cv\u0099\u0004äíÂõ5V¸À\u0098";
                        length = "\u0087º\u0015E°^öGs\u009dh\u008e\u009f/ó\u0091Ïhç¬tf\u0001a\u0006uò}ØÖQÐ\u0010ºÑ»\u008cv\u0099\u0004äíÂõ5V¸À\u0098".length();
                        cCharAt = ' ';
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

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
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
        int i2 = (i ^ ((int) (j2 & 32767))) ^ 5631;
        if (d[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) e.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j2 << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i2] = b(((Cipher) objArr[0]).doFinal(b[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/eb", e2);
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
            java.lang.String r1 = "su/catlean/eb"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.eb.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
