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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/eh.class */
public final class eh extends _g {

    @NotNull
    public static final eh k;
    static final /* synthetic */ KProperty[] d;

    @NotNull
    private static final cl c;
    private static final long a = yz.a(-120582353425786494L, -3124757141016495558L, MethodHandles.lookup().lookupClass()).a(210180638246449L);
    private static final String[] b;
    private static final String[] e;
    private static final Map f;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map i;

    /* JADX WARN: Illegal instructions before constructor call */
    private eh(long j) {
        long j2 = a ^ j;
        super((String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8444, 7977858845149874984L ^ j2) /* invoke-custom */, jt.v(), null, 4, null, j2 ^ 15342859207034L);
    }

    private final String T(long j) {
        return (String) c.E(this, (a ^ j) ^ 74987159281128L, d[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x038b A[Catch: NumberFormatException -> 0x03a7, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x03a7, blocks: (B:84:0x0362, B:87:0x0381, B:88:0x038a, B:89:0x038b, B:82:0x0358, B:83:0x0361), top: B:96:0x030e, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x027a A[EXC_TOP_SPLITTER, PHI: r0
  0x027a: PHI (r0v30 ??) = (r0v93 ??), (r0v94 ??), (r0v95 ??) binds: [B:30:0x01a4, B:55:0x024a, B:37:0x01d4] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [int] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [int] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v83, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void N(su.catlean.api.event.events.network.ReceivePacket r16) {
        /*
            Method dump skipped, instruction units count: 1031
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.eh.N(su.catlean.api.event.events.network.ReceivePacket):void");
    }

    static {
        int i2;
        long j = a ^ 16172648321292L;
        long j2 = j ^ 37882692190383L;
        long j3 = j ^ 64274134993988L;
        f = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[22];
        int i4 = 0;
        String str = "öe-^ñôÃ9ßþÛ¼\u0010W~f \u0096ôÜdSÑ\u001e\u0010\u0097\u000fv¶¶L?\u0001\u0099ÔÎìBÖq¸8J'\u0012\u001b%ë\u008d\u0018ÿ\u001aG#S*ÇzÄÌÖ9\u0001\u0010\u0016âN\u008føbøio| &ýç3*âöåØ¥qëë\bÕ\u009ea¥\nÃ\u0096\u0081¢TêC\u001d%¬\u0084Q \u0010Oí\u009bmÞkZ\u0089 SØ6í*uê\u0018O¿(ê\u0019e\u0083\u008d\u0087\u0003ÈÕm'2A\u00174a;?ô|\u0006\u0010õBÜk\u000eP\u009fª\u00adÐú\u0081 M¦²\u0018\u00ad³áboÔPïÎë\u0092÷Åº\u000b\u0006?\u0099\u0005?<¼\u0013Á ó\u0010²R\u0010¾}ß\nô\"28;.¢\u0011Õ\u0006=ØX\u0006ÅE\u009a\u008diÔN6b@\u0014\u008bËà\u0093©/õ]ºWRþEì\u0011À\u001c÷ÑAR×/\f¿Ì\u001aÑÑ?\u009a_UïUòu\u0087u\\Ç~ãÈ8DR\u001f\u0093\u0004¹\u0098{ýÆ©\u008f×BÁ½qó ë\fHÑ'å¶þ¢ëÐ¸\u000b7&ë\u001d\u0080t~¿Ê\u0089äaØñ[boöI\u0018+:ÙUÆö\\ñ¼\u0080\u0003¨²¿\u009eg)·±Sh2u\u0084  ÿìW\u0004èÝ^\u00893ÖÞ\u0098ñw?î<\u008e\u0087>÷\u0007×\u001ebbDE}¸ÞN\u0093P0¹£Ù\u0082E~!ñ\fc\u00980\u00842e\u0085\u008b3Ûß^\u008dî\u000b®1.\\2 _gu´\u0087\u0011¶[ËØ|OIQëÂÊäFÆc\u00adÀ\u0082!;\u001d÷\u007fB_ØfGh»;ZìÉÍ²b\u0004F£D±o¿\u009aI9ì[gy`_Má.ÿE(8'ß<\u0091òª\u008bé\u001cDÔÊ\u008dY\u0011G\u000b\u001a5\u00127oò\u0011\u009a\"\u000be\u0010Æïdé§\r\u009e\u0091÷ø$ý.Ð£) þ\u0002°i¨¡/·\u0084Ç&\u0013:T\u0014\u001cNð¢\u001bìÀã\u0099ÏµT\u0014\u009aÀ\u007fç0R±1\u009dâdPê\u0002Vµ\u0091\u008eãQÍ.ÿôúÜ\u0095Ä\u0099\u0005Ð\u0091~F/ëØ°\u008a\u0088È Aò__,\u0090£I-Ùý\u0018\u0004µx÷ø\u009e4L\u000eã`È]j\u001aôð÷\u0091\u008a/\u009d\u0006Å ò\u0019¨\u008bbÅ\u0007@º!\u0095'ÎhEº\u000böÏ\u001e\u0086\u0093-¹\u0097\u009eÇýg.¡ÿ\u0010ã¾5\u0089¿\u0084ü\u009b+÷+\u001a\tÓ9Ö(\u0091y\u0099Ñ·Ðü\u0096j\rä\u007f\u0080úU\u0097¿¥\u0082Á\u000bðT¢\u0005\u0099î9±T\u008dt»\u0094uM\u001b\u0019N\f";
        int length = "öe-^ñôÃ9ßþÛ¼\u0010W~f \u0096ôÜdSÑ\u001e\u0010\u0097\u000fv¶¶L?\u0001\u0099ÔÎìBÖq¸8J'\u0012\u001b%ë\u008d\u0018ÿ\u001aG#S*ÇzÄÌÖ9\u0001\u0010\u0016âN\u008føbøio| &ýç3*âöåØ¥qëë\bÕ\u009ea¥\nÃ\u0096\u0081¢TêC\u001d%¬\u0084Q \u0010Oí\u009bmÞkZ\u0089 SØ6í*uê\u0018O¿(ê\u0019e\u0083\u008d\u0087\u0003ÈÕm'2A\u00174a;?ô|\u0006\u0010õBÜk\u000eP\u009fª\u00adÐú\u0081 M¦²\u0018\u00ad³áboÔPïÎë\u0092÷Åº\u000b\u0006?\u0099\u0005?<¼\u0013Á ó\u0010²R\u0010¾}ß\nô\"28;.¢\u0011Õ\u0006=ØX\u0006ÅE\u009a\u008diÔN6b@\u0014\u008bËà\u0093©/õ]ºWRþEì\u0011À\u001c÷ÑAR×/\f¿Ì\u001aÑÑ?\u009a_UïUòu\u0087u\\Ç~ãÈ8DR\u001f\u0093\u0004¹\u0098{ýÆ©\u008f×BÁ½qó ë\fHÑ'å¶þ¢ëÐ¸\u000b7&ë\u001d\u0080t~¿Ê\u0089äaØñ[boöI\u0018+:ÙUÆö\\ñ¼\u0080\u0003¨²¿\u009eg)·±Sh2u\u0084  ÿìW\u0004èÝ^\u00893ÖÞ\u0098ñw?î<\u008e\u0087>÷\u0007×\u001ebbDE}¸ÞN\u0093P0¹£Ù\u0082E~!ñ\fc\u00980\u00842e\u0085\u008b3Ûß^\u008dî\u000b®1.\\2 _gu´\u0087\u0011¶[ËØ|OIQëÂÊäFÆc\u00adÀ\u0082!;\u001d÷\u007fB_ØfGh»;ZìÉÍ²b\u0004F£D±o¿\u009aI9ì[gy`_Má.ÿE(8'ß<\u0091òª\u008bé\u001cDÔÊ\u008dY\u0011G\u000b\u001a5\u00127oò\u0011\u009a\"\u000be\u0010Æïdé§\r\u009e\u0091÷ø$ý.Ð£) þ\u0002°i¨¡/·\u0084Ç&\u0013:T\u0014\u001cNð¢\u001bìÀã\u0099ÏµT\u0014\u009aÀ\u007fç0R±1\u009dâdPê\u0002Vµ\u0091\u008eãQÍ.ÿôúÜ\u0095Ä\u0099\u0005Ð\u0091~F/ëØ°\u008a\u0088È Aò__,\u0090£I-Ùý\u0018\u0004µx÷ø\u009e4L\u000eã`È]j\u001aôð÷\u0091\u008a/\u009d\u0006Å ò\u0019¨\u008bbÅ\u0007@º!\u0095'ÎhEº\u000böÏ\u001e\u0086\u0093-¹\u0097\u009eÇýg.¡ÿ\u0010ã¾5\u0089¿\u0084ü\u009b+÷+\u001a\tÓ9Ö(\u0091y\u0099Ñ·Ðü\u0096j\rä\u007f\u0080úU\u0097¿¥\u0082Á\u000bðT¢\u0005\u0099î9±T\u008dt»\u0094uM\u001b\u0019N\f".length();
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
                        if (i8 >= length) {
                            b = strArr;
                            e = new String[22];
                            i = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[3];
                            int i10 = 0;
                            int length2 = "caî\u001d¢\u00111\u0004\u0097cM\u001fcöDQßz\u009c~»\u008c»2".length();
                            int i11 = 0;
                            do {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = "caî\u001d¢\u00111\u0004\u0097cM\u001fcöDQßz\u009c~»\u008c»2".substring(i12, i11).getBytes("ISO-8859-1");
                                i10++;
                                byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (r2 >>> 56), (byte) (r2 >>> 48), (byte) (r2 >>> 40), (byte) (r2 >>> 32), (byte) (r2 >>> 24), (byte) (r2 >>> 16), (byte) (r2 >>> 8), (byte) (((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255))});
                                jArr[-1] = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                            } while (i11 < length2);
                            g = jArr;
                            h = new Integer[3];
                            d = new KProperty[]{Reflection.property1(new PropertyReference1Impl(eh.class, (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27887, 3206111157023140829L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20558, 4133151935191111527L ^ j) /* invoke-custom */, 0))};
                            k = new eh(j2);
                            c = yp.x(k, (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29969, 5853902166882480700L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24905, 5451603719671932542L ^ j) /* invoke-custom */, (h) null, (Function0) null, (int) c(MethodHandles.lookup(), "u", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32477, 4188575274274281011L ^ j) /* invoke-custom */, j3, (Object) null);
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
                        str = "\f¢Rk\u000eA¤v´¤T6H\u0085¹ô0°¡/ÊµhfÔkT^Ú^³Ú\u0014\u009f-\bB~\u0006ÿòND\u001cäÝ´P¤b\u0097Ê\u0083<ÿ\u0083\n¡¤\u007f\u0085ø3ÍY";
                        length = "\f¢Rk\u000eA¤v´¤T6H\u0085¹ô0°¡/ÊµhfÔkT^Ú^³Ú\u0014\u009f-\bB~\u0006ÿòND\u001cäÝ´P¤b\u0097Ê\u0083<ÿ\u0083\n¡¤\u007f\u0085ø3ÍY".length();
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
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 31349;
        if (e[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) f.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                e[i3] = b(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/eh", e2);
            }
        }
        return e[i3];
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
            java.lang.String r1 = "su/catlean/eh"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.eh.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 21948;
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
                    throw new RuntimeException("su/catlean/eh", e2);
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

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iC = c(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iC)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iC;
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
            java.lang.String r1 = "su/catlean/eh"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.eh.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
