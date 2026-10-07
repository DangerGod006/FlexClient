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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/e5.class */
public final class e5 extends _g {

    @NotNull
    public static final e5 X;
    private static final long a = yz.a(2183204535370178327L, 4000594027204175459L, MethodHandles.lookup().lookupClass()).a(204200164338358L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    /* JADX WARN: Illegal instructions before constructor call */
    private e5(long j) {
        long j2 = a ^ j;
        super((String) b(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20417, 733222725113243333L ^ j2) /* invoke-custom */, jt.v(), null, 4, null, j2 ^ 3720653398498L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0196 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0176 A[EXC_TOP_SPLITTER, PHI: r0
  0x0176: PHI (r0v53 ??) = (r0v105 ??), (r0v106 ??), (r0v107 ??), (r0v108 ??), (r0v109 ??) binds: [B:5:0x0056, B:12:0x0097, B:21:0x00c7, B:30:0x00f9, B:50:0x016a] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0183 A[Catch: NumberFormatException -> 0x0189, TRY_LEAVE, TryCatch #14 {NumberFormatException -> 0x0189, blocks: (B:51:0x0176, B:53:0x0183), top: B:111:0x0176 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ff A[PHI: r0
  0x01ff: PHI (r0v33 ??) = (r0v112 ??), (r0v113 ??) binds: [B:62:0x01d1, B:67:0x01e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0240 A[PHI: r0
  0x0240: PHI (r0v36 ??) = (r0v33 ??), (r0v47 ??) binds: [B:71:0x0201, B:81:0x022b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0243 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v110 */
    /* JADX WARN: Type inference failed for: r0v111 */
    /* JADX WARN: Type inference failed for: r0v112 */
    /* JADX WARN: Type inference failed for: r0v113 */
    /* JADX WARN: Type inference failed for: r0v114 */
    /* JADX WARN: Type inference failed for: r0v115 */
    /* JADX WARN: Type inference failed for: r0v116 */
    /* JADX WARN: Type inference failed for: r0v117 */
    /* JADX WARN: Type inference failed for: r0v118 */
    /* JADX WARN: Type inference failed for: r0v119 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v120 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, net.minecraft.class_239] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [net.minecraft.class_3966] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v42, types: [net.minecraft.class_746] */
    /* JADX WARN: Type inference failed for: r0v43, types: [net.minecraft.class_746] */
    /* JADX WARN: Type inference failed for: r0v47, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [net.minecraft.class_3965] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X(@org.jetbrains.annotations.NotNull su.catlean.api.event.events.player.PlayerUpdateEvent r9) {
        /*
            Method dump skipped, instruction units count: 658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e5.X(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    static {
        long j = (a ^ 67479086707050L) ^ 34119488045137L;
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (r0 >>> 56);
        for (int i = 1; i < 8; i++) {
            bArr[i] = (byte) ((r0 << (i * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[3];
        int i2 = 0;
        int length = "¦¢¢\u008dKc¥\u008cf\u001aÃ°\u001ajÙó³~é\u0092yg¶T´Ó~S\u008e\u0000a\u001c\u007fñk\u001býI\u0081\u0007Su\u009a\u0001\u0089ä&\u0092\u009fb¯n\u0004Li 5\u008c°Î3\u000fÆê¾\u0013Éh\u0096\u008c0-h\u00966Ü\u0012\u0003×ÑÏ \u008ev6R\u008d\u008f±\u001eJ\u0012ªG\u008fÊùÕBú»g~\u0098&\u0085\u0018\u0019\u0086\u0003ÙH¢{ï\u001eB%6l«S\u001cÊ\u001f\u0097·Ê Û04lM¯$Ú\\q\u009cÞ~?\u0013\u00adL\u0001Ç»\rkÇ\u0087náðÌ\nL¼¥x¿Fç\u0098ó×Ü\u000bñ\u00034\u0095åIº®\u001c\u001a\u0007K 9çKÑÊüÆû B\u007f×á\u00837\u0010%ÆÃd@qåÉ\u0018VA\u0093½ñe\u007f\u000b§ÈDh\\ÞìÝ\u009b\u000e\u0084^Õ^\f2]²¯ØéåY\u0011¨\\H$À\u0088E°\u0095Ù¹âI\u0007º\u0097\u0087«*ÅÑ>]þ\u009eÉ/þÙÅèi*¨%FÓú×Z\u0087å".length();
        char cCharAt = 128;
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = b(cipher.doFinal("¦¢¢\u008dKc¥\u008cf\u001aÃ°\u001ajÙó³~é\u0092yg¶T´Ó~S\u008e\u0000a\u001c\u007fñk\u001býI\u0081\u0007Su\u009a\u0001\u0089ä&\u0092\u009fb¯n\u0004Li 5\u008c°Î3\u000fÆê¾\u0013Éh\u0096\u008c0-h\u00966Ü\u0012\u0003×ÑÏ \u008ev6R\u008d\u008f±\u001eJ\u0012ªG\u008fÊùÕBú»g~\u0098&\u0085\u0018\u0019\u0086\u0003ÙH¢{ï\u001eB%6l«S\u001cÊ\u001f\u0097·Ê Û04lM¯$Ú\\q\u009cÞ~?\u0013\u00adL\u0001Ç»\rkÇ\u0087náðÌ\nL¼¥x¿Fç\u0098ó×Ü\u000bñ\u00034\u0095åIº®\u001c\u001a\u0007K 9çKÑÊüÆû B\u007f×á\u00837\u0010%ÆÃd@qåÉ\u0018VA\u0093½ñe\u007f\u000b§ÈDh\\ÞìÝ\u009b\u000e\u0084^Õ^\f2]²¯ØéåY\u0011¨\\H$À\u0088E°\u0095Ù¹âI\u0007º\u0097\u0087«*ÅÑ>]þ\u009eÉ/þÙÅèi*¨%FÓú×Z\u0087å".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                b = strArr;
                c = new String[3];
                X = new e5(j);
                return;
            }
            cCharAt = "¦¢¢\u008dKc¥\u008cf\u001aÃ°\u001ajÙó³~é\u0092yg¶T´Ó~S\u008e\u0000a\u001c\u007fñk\u001býI\u0081\u0007Su\u009a\u0001\u0089ä&\u0092\u009fb¯n\u0004Li 5\u008c°Î3\u000fÆê¾\u0013Éh\u0096\u008c0-h\u00966Ü\u0012\u0003×ÑÏ \u008ev6R\u008d\u008f±\u001eJ\u0012ªG\u008fÊùÕBú»g~\u0098&\u0085\u0018\u0019\u0086\u0003ÙH¢{ï\u001eB%6l«S\u001cÊ\u001f\u0097·Ê Û04lM¯$Ú\\q\u009cÞ~?\u0013\u00adL\u0001Ç»\rkÇ\u0087náðÌ\nL¼¥x¿Fç\u0098ó×Ü\u000bñ\u00034\u0095åIº®\u001c\u001a\u0007K 9çKÑÊüÆû B\u007f×á\u00837\u0010%ÆÃd@qåÉ\u0018VA\u0093½ñe\u007f\u000b§ÈDh\\ÞìÝ\u009b\u000e\u0084^Õ^\f2]²¯ØéåY\u0011¨\\H$À\u0088E°\u0095Ù¹âI\u0007º\u0097\u0087«*ÅÑ>]þ\u009eÉ/þÙÅèi*¨%FÓú×Z\u0087å".charAt(i3);
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

    private static String b(int i, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = (i ^ ((int) (j & 32767))) ^ 6206;
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
                c[i2] = b(((Cipher) objArr[0]).doFinal(b[i2].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/e5", e);
            }
        }
        return c[i2];
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
            java.lang.String r1 = "su/catlean/e5"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.e5.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
