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
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_4587;
import net.minecraft.class_6364;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/iv.class */
public final class iv {

    @Nullable
    private class_6364 U;

    @Nullable
    private class_6364 O;
    private boolean I;
    private static final String[] b;
    private static final String[] c;
    private static final long a = yz.a(-6069123381226583021L, -4246976263572382941L, MethodHandles.lookup().lookupClass()).a(263357040169584L);
    private static final Map d = new HashMap(13);

    @Nullable
    public final class_6364 d() {
        return this.U;
    }

    public final void q(@Nullable class_6364 class_6364Var) {
        this.U = class_6364Var;
    }

    @Nullable
    public final class_6364 w() {
        return this.O;
    }

    public final void A(@Nullable class_6364 class_6364Var) {
        this.O = class_6364Var;
    }

    public final boolean C() {
        return this.I;
    }

    public final void V(boolean z) {
        this.I = z;
    }

    public final void V(@NotNull class_4587 stack, boolean crystals, long a2, int vDistance, int hDistance) throws Exception {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(stack, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25157, 8129070980662351188L ^ j) /* invoke-custom */);
        this.I = true;
        E((char) (j >>> 48), (short) ((r1 << 16) >>> 48), (int) (((j ^ 113367984972499L) << 32) >>> 32));
        m(stack, crystals, j ^ 118888592761640L, vDistance, hDistance);
        this.I = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v19, types: [net.minecraft.class_6364] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O(@org.jetbrains.annotations.NotNull su.catlean.rw r25, @org.jetbrains.annotations.NotNull java.awt.Color r26, boolean r27, boolean r28, float r29, float r30, int r31, float r32, float r33, int r34, @org.jetbrains.annotations.NotNull java.awt.Color r35, @org.jetbrains.annotations.NotNull java.awt.Color r36, int r37, short r38, float r39, float r40, float r41, float r42, char r43, float r44, float r45) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.iv.O(su.catlean.rw, java.awt.Color, boolean, boolean, float, float, int, float, float, int, java.awt.Color, java.awt.Color, int, short, float, float, float, float, char, float, float):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d0 A[PHI: r0 r1
  0x00d0: PHI (r0v21 ??) = (r0v73 ??), (r0v74 ??), (r0v75 ??) binds: [B:14:0x0093, B:16:0x0098, B:21:0x00ac] A[DONT_GENERATE, DONT_INLINE]
  0x00d0: PHI (r1v22 int) = (r1v21 int), (r1v21 int), (r1v57 int) binds: [B:14:0x0093, B:16:0x0098, B:21:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d0 A[PHI: r0 r1
  0x01d0: PHI (r0v37 ??) = (r0v70 ??), (r0v71 ??), (r0v72 ??) binds: [B:41:0x0193, B:43:0x0198, B:48:0x01ac] A[DONT_GENERATE, DONT_INLINE]
  0x01d0: PHI (r1v34 int) = (r1v33 int), (r1v33 int), (r1v46 int) binds: [B:41:0x0193, B:43:0x0198, B:48:0x01ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [net.minecraft.class_6364] */
    /* JADX WARN: Type inference failed for: r0v15, types: [net.minecraft.class_276] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [net.minecraft.class_6364] */
    /* JADX WARN: Type inference failed for: r0v31, types: [net.minecraft.class_276] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [int] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, net.minecraft.class_6364] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, net.minecraft.class_6364] */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void E(char r8, short r9, int r10) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.iv.E(char, short, int):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final void m(net.minecraft.class_4587 r14, boolean r15, long r16, int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 1186
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.iv.m(net.minecraft.class_4587, boolean, long, int, int):void");
    }

    static {
        int i;
        long j = a ^ 29976398159775L;
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
        String str = "U·BÀ}ÛÒ\u0098\u0002wíÒà¡Ø;ÚÂD/m$gb_E\u0015\u0013×½\u0096µw\u008cðµW\u0095\u000eù&2P$Á\u009eå¼\u0088¬}ñgNI´¼\u000bÒrd\u00ady\u0096îk\u0018Q1ÀQÆÙcKh\u007ffîüx\u000e+ÚÝ¶l)¤\u0083Ø\u00861\u0085µ\u0014Þ©Î\u009fSdÃB\u0084Pé¯tÑ->\u000bFÏz\u0097jª ÍÆ1/\u0005 d\u0089ËÄ\u009dT\u0080¼\u0091þuf7Z\u008e\u001a^.±ã¾ l\u0099Î^´d\u000b\u001eNç\u0011èa\u0082\u0099éüØ-Ì\u00850®(&*wwìÍ¥Ø\u0017¶©»Ñ(\u009b½\u00890ÿ\u0094\u0094}ÅÉÁ\u009cµ\u000b[ëË:V-ÜZ\n{ÿLÄ\u009aÀhÌf®$ê=\u001cO×Ò\u0010\u0093M÷Ë\u0090\u0085Ùò!]pê\fy¬\u008a\u0088JäMOs\u0019\u0015Û\u0016Ä\r\u009b\u001cñØU$9û\u0098Oô>Ác\u00171\u0089Ï\u008bÕ\u009dBÒQÚ\\\u0017\u0018nÜ`\u0097¨\u0092îg\u008e¸\u0098é$Î×k6TkÉO&\u009aM{Ö[F*W!£w)\n¯+ß\u008b¿ä«\u009a}(¿¶\u0080vb\u0081®\u0090fÖÝÈÃ±\u0094ìÓ\u008a«\u0016þü°§»®\u00850uð.0;\u001f[Õ·>ÀÂ\u008a\u0005T\u001d©o8Ha\u0018[6(T¼¶ãå\u0005¹¶d³rï£\u0019\u009c\u0092\r\u0011\u0019-$\u0018í\u0017cuý \u008dëÇÆg\u0003Éèä1S×\u0010®\u0006ÿéÎ\\°`ä\u0086bÐ\u0097è\u001e%\u0010¯¢\u0001¯ñÃçÝ**µ@Á¡O\u0007 \\\u0090Ãéëà\u0095DÎ¹Æ#\u00951ÀÁ\u0092\u009cîuú\u007fcÂ±'±e\u0096Â÷© ð\u001cö\u001e%\b9\u0099)µPÞ¡éö°YHí«ô\u0007\u008f\t\u001b§a\r!+\t\u0001(èb\u009a\u0096\u0017pÌ \u0006HÜ§õØ\u008dûÒ\u001f\u0093ä¶&\u0081Û\nA¤©I÷õ\u0085µ\"ÊÎ\u009am\rÊ";
        int length = "U·BÀ}ÛÒ\u0098\u0002wíÒà¡Ø;ÚÂD/m$gb_E\u0015\u0013×½\u0096µw\u008cðµW\u0095\u000eù&2P$Á\u009eå¼\u0088¬}ñgNI´¼\u000bÒrd\u00ady\u0096îk\u0018Q1ÀQÆÙcKh\u007ffîüx\u000e+ÚÝ¶l)¤\u0083Ø\u00861\u0085µ\u0014Þ©Î\u009fSdÃB\u0084Pé¯tÑ->\u000bFÏz\u0097jª ÍÆ1/\u0005 d\u0089ËÄ\u009dT\u0080¼\u0091þuf7Z\u008e\u001a^.±ã¾ l\u0099Î^´d\u000b\u001eNç\u0011èa\u0082\u0099éüØ-Ì\u00850®(&*wwìÍ¥Ø\u0017¶©»Ñ(\u009b½\u00890ÿ\u0094\u0094}ÅÉÁ\u009cµ\u000b[ëË:V-ÜZ\n{ÿLÄ\u009aÀhÌf®$ê=\u001cO×Ò\u0010\u0093M÷Ë\u0090\u0085Ùò!]pê\fy¬\u008a\u0088JäMOs\u0019\u0015Û\u0016Ä\r\u009b\u001cñØU$9û\u0098Oô>Ác\u00171\u0089Ï\u008bÕ\u009dBÒQÚ\\\u0017\u0018nÜ`\u0097¨\u0092îg\u008e¸\u0098é$Î×k6TkÉO&\u009aM{Ö[F*W!£w)\n¯+ß\u008b¿ä«\u009a}(¿¶\u0080vb\u0081®\u0090fÖÝÈÃ±\u0094ìÓ\u008a«\u0016þü°§»®\u00850uð.0;\u001f[Õ·>ÀÂ\u008a\u0005T\u001d©o8Ha\u0018[6(T¼¶ãå\u0005¹¶d³rï£\u0019\u009c\u0092\r\u0011\u0019-$\u0018í\u0017cuý \u008dëÇÆg\u0003Éèä1S×\u0010®\u0006ÿéÎ\\°`ä\u0086bÐ\u0097è\u001e%\u0010¯¢\u0001¯ñÃçÝ**µ@Á¡O\u0007 \\\u0090Ãéëà\u0095DÎ¹Æ#\u00951ÀÁ\u0092\u009cîuú\u007fcÂ±'±e\u0096Â÷© ð\u001cö\u001e%\b9\u0099)µPÞ¡éö°YHí«ô\u0007\u008f\t\u001b§a\r!+\t\u0001(èb\u009a\u0096\u0017pÌ \u0006HÜ§õØ\u008dûÒ\u001f\u0093ä¶&\u0081Û\nA¤©I÷õ\u0085µ\"ÊÎ\u009am\rÊ".length();
        char cCharAt = '0';
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
                            c = new String[13];
                            return;
                        }
                        cCharAt = str.charAt(i);
                        break;
                    default:
                        int i8 = i3;
                        i3++;
                        strArr[i8] = strIntern;
                        int i9 = i5 + cCharAt;
                        i4 = i9;
                        if (i9 < length) {
                        }
                        str = "\u0090äNp¢\u0085$\u0089\f¥@èóV/Ñ\u0010÷¾{\u001eGgA;\u0001\u0013\u009a\u0084UÁu·";
                        length = "\u0090äNp¢\u0085$\u0089\f¥@èóV/Ñ\u0010÷¾{\u001eGgA;\u0001\u0013\u009a\u0084UÁu·".length();
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

    private static Exception a(Exception exc) {
        return exc;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 16289;
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
                throw new RuntimeException("su/catlean/iv", e);
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
            java.lang.String r1 = "su/catlean/iv"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.iv.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
