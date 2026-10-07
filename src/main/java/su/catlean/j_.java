package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/j_.class */
public final class j_ {

    @NotNull
    public static final j_ N;
    private static final String[] b;
    private static final String[] c;
    private static final long a = yz.a(-8706407952680489308L, 4127609483980001596L, MethodHandles.lookup().lookupClass()).a(100345552919754L);
    private static final Map d = new HashMap(13);

    private j_() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:103:0x02dc, B:91:0x02a6], limit reached: 176 */
    /* JADX WARN: Path cross not found for [B:116:0x0332, B:123:0x0355], limit reached: 176 */
    /* JADX WARN: Path cross not found for [B:123:0x0355, B:116:0x0332], limit reached: 176 */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0193 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[LOOP:2: B:81:0x0270->B:184:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0283 A[PHI: r41
  0x0283: PHI (r41v4 ??) = (r41v9 ??), (r41v5 ??) binds: [B:129:0x039c, B:83:0x027a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0294  */
    /* JADX WARN: Type inference failed for: r0v100, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v101, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v102, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v107, types: [int] */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v110 */
    /* JADX WARN: Type inference failed for: r0v111, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v114 */
    /* JADX WARN: Type inference failed for: r0v115 */
    /* JADX WARN: Type inference failed for: r0v121 */
    /* JADX WARN: Type inference failed for: r0v131 */
    /* JADX WARN: Type inference failed for: r0v135, types: [int] */
    /* JADX WARN: Type inference failed for: r0v136, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v138, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v139, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v14, types: [net.minecraft.class_1297] */
    /* JADX WARN: Type inference failed for: r0v141, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v150 */
    /* JADX WARN: Type inference failed for: r0v151 */
    /* JADX WARN: Type inference failed for: r0v152 */
    /* JADX WARN: Type inference failed for: r0v153 */
    /* JADX WARN: Type inference failed for: r0v154 */
    /* JADX WARN: Type inference failed for: r0v155 */
    /* JADX WARN: Type inference failed for: r0v156 */
    /* JADX WARN: Type inference failed for: r0v157 */
    /* JADX WARN: Type inference failed for: r0v158 */
    /* JADX WARN: Type inference failed for: r0v159 */
    /* JADX WARN: Type inference failed for: r0v160 */
    /* JADX WARN: Type inference failed for: r0v161 */
    /* JADX WARN: Type inference failed for: r0v162 */
    /* JADX WARN: Type inference failed for: r0v163 */
    /* JADX WARN: Type inference failed for: r0v164 */
    /* JADX WARN: Type inference failed for: r0v165 */
    /* JADX WARN: Type inference failed for: r0v166 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v47, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v80 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v96, types: [int] */
    /* JADX WARN: Type inference failed for: r0v97, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v99, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [net.minecraft.class_1297] */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r39v1 */
    /* JADX WARN: Type inference failed for: r41v0, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v10 */
    /* JADX WARN: Type inference failed for: r41v11 */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /* JADX WARN: Type inference failed for: r41v4 */
    /* JADX WARN: Type inference failed for: r41v5 */
    /* JADX WARN: Type inference failed for: r41v6 */
    /* JADX WARN: Type inference failed for: r41v7 */
    /* JADX WARN: Type inference failed for: r41v9 */
    /* JADX WARN: Type inference failed for: r42v2 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:129:0x039c -> B:84:0x0283). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(@org.jetbrains.annotations.NotNull su.catlean.s8 r12, @org.jetbrains.annotations.NotNull java.awt.Color r13, @org.jetbrains.annotations.NotNull java.awt.Color r14, int r15, long r16, int r18) {
        /*
            Method dump skipped, instruction units count: 986
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.j_.g(su.catlean.s8, java.awt.Color, java.awt.Color, int, long, int):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x04e2: INVOKE (r-1 I:su.catlean.zi), (r0 I:net.minecraft.class_238), (r1 I:java.awt.Color), (r2 I:long), (r3 I:java.awt.Color) VIRTUAL call: su.catlean.zi.F(net.minecraft.class_238, java.awt.Color, long, java.awt.Color):boolean
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public final void E(char r12, int r13, @org.jetbrains.annotations.NotNull su.catlean.s8 r14, @org.jetbrains.annotations.NotNull java.awt.Color r15, @org.jetbrains.annotations.NotNull java.awt.Color r16, @org.jetbrains.annotations.NotNull java.awt.Color r17, @org.jetbrains.annotations.NotNull java.awt.Color r18, int r19, int r20, @org.jetbrains.annotations.NotNull java.awt.Color r21, short r22, @org.jetbrains.annotations.NotNull java.awt.Color r23, @org.jetbrains.annotations.NotNull java.awt.Color r24, @org.jetbrains.annotations.NotNull java.awt.Color r25) {
        /*
            Method dump skipped, instruction units count: 1421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.j_.E(char, int, su.catlean.s8, java.awt.Color, java.awt.Color, java.awt.Color, java.awt.Color, int, int, java.awt.Color, short, java.awt.Color, java.awt.Color, java.awt.Color):void");
    }

    static {
        int i;
        long j = a ^ 26743130293335L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[20];
        int i3 = 0;
        String str = "«¶\u000eïÁålý@ÿUmiZÇ\u0010Kg\b;\u0083\u009f\u001aã\u0018à´îA\u0081%õJ\u001f8]Ü.\u0004Å³²\r;\u001c`G´\u0091\u0080\u009ft\u0086À\u001fþ·c\\\u0084¤MÊ»¦é4\u000foúàÓ\u001b\tx~ñ¾MG\u0098ë\u0087±ÛB9\u0011\u009fiõ\u0012\u009e¾°íÒÈ\u0080/b\u0082[íà+ÑºaÖö\u0002q]fª;\u0093s\u0019{¿óü\u000f\u0010\u008b\u009aüUPÍ;\r\u008eiuUEÓ\u0093µ¢{§\u008aÃ«\"¡Wue2Ï\u0093á/\u008a{\u0006ñ\u008eÒ(Ü\u0017=%b«Ø\u001eú\u009eb\u0015Ù Mª=±z\u0097´4ïÔ\u0091r¤(ä\u0011¸q\u0092À\u008dÍr\u008c÷\u0095\u0098¨\u001f\bù\u0098\u0018¡ÿ¡Vì6Z2pïÆî\u009b:&3\u001d§^q)r¨{\u0018ZkK.X&\u0011·¿u7|1Äô¥\u00183³à\u000e÷7\u000e(¥\u008baÛz\u009fF\u009d\u0010E\u0005\u0007_E?ÉÑ\u001f\u001e<\u009a\\Q$\u0018U\u0096kw^\u009dÍ\b*Ìk\u0017Ñ\u0000P e\u0083]\u008bòã\u0004ì&\u0004\u001b¯\u0003¾VØ¡1¨:Ï-âÿ¬ e¦\f\u001f:\u0085(\u0018\u0081nWþ«\u0000\u0090\u00836\u0014A\u001cj\u009a±\u000e\u0083éÃ¿ñ§Næ\u0095°\u009d¨tÉàCÐç\\%½\u0003\u0013 {q¼Ì\u000bÙ\u000b0M\u0085¾`\u00adÖ\u009bó³½4\u0016?î|Jæ\u0006/\u0006\u008e¡\"© &ÀVe\u009aVÖ\u0085Ùpd}E\u009cðº,\u0019_£\u0097PÙÈpdÃ¹L\u008dgW nì\u0086OIû\u008b^ÐÝÀ\u008f?ò6\u0014\u00886\u0096Á[Í\u009d\u0010Ì]§uóI\u0097i8¤\u0087êó¿\u0096ÑÍæ×¦9\u009f»,A\u0098\u0010Ðked©\u0003'5@iÌ\u0017¦ÆÌ[2\u001c/\u009dRE\u0089Î+Áå8Anæ\u001bÚ\u009fÐMPW ç2Ø\u009cg¾±fÌâ$Â\u008fAûGkaª\u0097ì÷Ä5\u008cz\u00addÐ8\u0099\u00908\u001fÜýDá0l\u0088L\u008c\u0006©#Ù×\u0006ëË*\u0094\u001f\béÎ\u001c\u00adA¯\u008fxOï\u0019µ\u008eë\u0085Þ`s\u008e\u0000\u0089!æ\u009cHBrÂëMÛ\fÀ\u0080\u0018H\u0016²\u000bÜ\u001acN\bKÍ\u0095ÿ\u0004\n&¡mÁ5y11g(Ã¹\u008cò`ü\u009a\u0019YS¢\u0004ä0áÁ\r\u0090½çÑK{V\u009eíNãÂÊÐtÑ\u009c&r¹#\u0095ø(ÊÂüþ\u000e¬J¡\u001e\u008e¤\u008e8\u001c\u0013ÌÂ\u0016\u00adóH\u0005sÇ7Í\u0098K\u0013)¿yÏ\u009ct\u0087G¥ùH";
        int length = "«¶\u000eïÁålý@ÿUmiZÇ\u0010Kg\b;\u0083\u009f\u001aã\u0018à´îA\u0081%õJ\u001f8]Ü.\u0004Å³²\r;\u001c`G´\u0091\u0080\u009ft\u0086À\u001fþ·c\\\u0084¤MÊ»¦é4\u000foúàÓ\u001b\tx~ñ¾MG\u0098ë\u0087±ÛB9\u0011\u009fiõ\u0012\u009e¾°íÒÈ\u0080/b\u0082[íà+ÑºaÖö\u0002q]fª;\u0093s\u0019{¿óü\u000f\u0010\u008b\u009aüUPÍ;\r\u008eiuUEÓ\u0093µ¢{§\u008aÃ«\"¡Wue2Ï\u0093á/\u008a{\u0006ñ\u008eÒ(Ü\u0017=%b«Ø\u001eú\u009eb\u0015Ù Mª=±z\u0097´4ïÔ\u0091r¤(ä\u0011¸q\u0092À\u008dÍr\u008c÷\u0095\u0098¨\u001f\bù\u0098\u0018¡ÿ¡Vì6Z2pïÆî\u009b:&3\u001d§^q)r¨{\u0018ZkK.X&\u0011·¿u7|1Äô¥\u00183³à\u000e÷7\u000e(¥\u008baÛz\u009fF\u009d\u0010E\u0005\u0007_E?ÉÑ\u001f\u001e<\u009a\\Q$\u0018U\u0096kw^\u009dÍ\b*Ìk\u0017Ñ\u0000P e\u0083]\u008bòã\u0004ì&\u0004\u001b¯\u0003¾VØ¡1¨:Ï-âÿ¬ e¦\f\u001f:\u0085(\u0018\u0081nWþ«\u0000\u0090\u00836\u0014A\u001cj\u009a±\u000e\u0083éÃ¿ñ§Næ\u0095°\u009d¨tÉàCÐç\\%½\u0003\u0013 {q¼Ì\u000bÙ\u000b0M\u0085¾`\u00adÖ\u009bó³½4\u0016?î|Jæ\u0006/\u0006\u008e¡\"© &ÀVe\u009aVÖ\u0085Ùpd}E\u009cðº,\u0019_£\u0097PÙÈpdÃ¹L\u008dgW nì\u0086OIû\u008b^ÐÝÀ\u008f?ò6\u0014\u00886\u0096Á[Í\u009d\u0010Ì]§uóI\u0097i8¤\u0087êó¿\u0096ÑÍæ×¦9\u009f»,A\u0098\u0010Ðked©\u0003'5@iÌ\u0017¦ÆÌ[2\u001c/\u009dRE\u0089Î+Áå8Anæ\u001bÚ\u009fÐMPW ç2Ø\u009cg¾±fÌâ$Â\u008fAûGkaª\u0097ì÷Ä5\u008cz\u00addÐ8\u0099\u00908\u001fÜýDá0l\u0088L\u008c\u0006©#Ù×\u0006ëË*\u0094\u001f\béÎ\u001c\u00adA¯\u008fxOï\u0019µ\u008eë\u0085Þ`s\u008e\u0000\u0089!æ\u009cHBrÂëMÛ\fÀ\u0080\u0018H\u0016²\u000bÜ\u001acN\bKÍ\u0095ÿ\u0004\n&¡mÁ5y11g(Ã¹\u008cò`ü\u009a\u0019YS¢\u0004ä0áÁ\r\u0090½çÑK{V\u009eíNãÂÊÐtÑ\u009c&r¹#\u0095ø(ÊÂüþ\u000e¬J¡\u001e\u008e¤\u008e8\u001c\u0013ÌÂ\u0016\u00adóH\u0005sÇ7Í\u0098K\u0013)¿yÏ\u009ct\u0087G¥ùH".length();
        char cCharAt = 24;
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
                        if (i7 >= length) {
                            b = strArr;
                            c = new String[20];
                            N = new j_();
                            return;
                        }
                        cCharAt = str.charAt(i);
                        break;
                        break;
                    default:
                        int i8 = i3;
                        i3++;
                        strArr[i8] = strIntern;
                        int i9 = i5 + cCharAt;
                        i4 = i9;
                        if (i9 < length) {
                        }
                        str = "\u0013pHHÞ\u0011Îæá¿y,b+sÖ\u0010\u000f\u0004\u0098û8\rÒ\u0004DÓ°ôú<\u009aÉ";
                        length = "\u0013pHHÞ\u0011Îæá¿y,b+sÖ\u0010\u000f\u0004\u0098û8\rÒ\u0004DÓ°ôú<\u009aÉ".length();
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 19977;
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
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/j_", e);
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
            java.lang.String r1 = "su/catlean/j_"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.j_.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
