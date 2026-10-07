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
import kotlin.math.MathKt;
import net.minecraft.class_241;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.KeyboardInputEvent;
import su.catlean.gofra.Flow;
import su.catlean.mixins.accessors.ClientInputAccessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/_2.class */
public final class _2 extends _g {

    @NotNull
    public static final _2 x;
    private static boolean L;
    private static final long a = yz.a(-4175720866563902228L, 5721813900176972765L, MethodHandles.lookup().lookupClass()).a(179858694017357L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    /* JADX WARN: Illegal instructions before constructor call */
    private _2(long j) {
        long j2 = a ^ j;
        super((String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11866, 2080629042046877067L ^ j2) /* invoke-custom */, jt.c(), null, 4, null, j2 ^ 68081570894101L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008b  */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void q(su.catlean.api.event.events.player.PlayerUpdateEvent r13) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._2.q(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Flow(priority = 10)
    private final void G(KeyboardInputEvent keyboardInputEvent) {
        long j = a ^ 36266818486697L;
        int i = (int) (j >>> 32);
        long j2 = ((j ^ 99826608195707L) << 32) >>> 32;
        long j3 = j ^ 44232248837845L;
        Object obj = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1496861210410410552L, j) /* invoke-custom */;
        try {
            obj = L;
            boolean z = obj;
            if (obj != 0) {
                if (obj == 0) {
                    return;
                } else {
                    z = 0;
                }
            }
            L = z;
            float f = zf.v(j3).field_3913.method_3128().field_1342;
            float f2 = zf.v(j3).field_3913.method_3128().field_1343;
            float fMethod_36454 = (zf.v(j3).method_36454() - dm.h.b(i, j2)) * 0.017453292f;
            float fCos = (float) Math.cos(fMethod_36454);
            float fSin = (float) Math.sin(fMethod_36454);
            ClientInputAccessor clientInputAccessor = zf.v(j3).field_3913;
            Intrinsics.checkNotNull(clientInputAccessor, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23720, 1312095629391518478L ^ j) /* invoke-custom */);
            clientInputAccessor.setMoveVector(new class_241(MathKt.roundToInt((f2 * fCos) - (f * fSin)), MathKt.roundToInt((f * fCos) + (f2 * fSin))));
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 1500937073138863094L, j) /* invoke-custom */;
        }
    }

    static {
        long j = (a ^ 79066652527624L) ^ 100292575481284L;
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (r0 >>> 56);
        for (int i = 1; i < 8; i++) {
            bArr[i] = (byte) ((r0 << (i * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[2];
        int i2 = 0;
        int length = "\f\u0098\u0097Û\u008eú8\u0000\u0092\u000erLù×\u008b\u001e\u008f\u0002\u0083rÅ\u0011ÉV\u0090\u001c¹±\u00896\u0093\u009e§KU\u0095rAôuæÆ½pOÝìpZ\u000eÚ\u0092ºS8|D¹,gä7H\u0085`ä´)2¥\u0084¡2\u009fô\"Åû \u009cmØ\u0018o\u0004TJ'ó-ñ\u0099?*Z*õ¼\u001efÀ\u009bæòðÓ>Fò\u0016ó\u0004úÂaÈ¥mÑQ5²\u0099Á\u0082§mýÛ¯Ã\u008e&åöÚ¶¤ Æ²\u0096}\u000bùÇóÊ®°Ø\u009fSÚ¹\u009b<ì2*òÐ¤½é@ñÓ£".length();
        char cCharAt = 24;
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = b(cipher.doFinal("\f\u0098\u0097Û\u008eú8\u0000\u0092\u000erLù×\u008b\u001e\u008f\u0002\u0083rÅ\u0011ÉV\u0090\u001c¹±\u00896\u0093\u009e§KU\u0095rAôuæÆ½pOÝìpZ\u000eÚ\u0092ºS8|D¹,gä7H\u0085`ä´)2¥\u0084¡2\u009fô\"Åû \u009cmØ\u0018o\u0004TJ'ó-ñ\u0099?*Z*õ¼\u001efÀ\u009bæòðÓ>Fò\u0016ó\u0004úÂaÈ¥mÑQ5²\u0099Á\u0082§mýÛ¯Ã\u008e&åöÚ¶¤ Æ²\u0096}\u000bùÇóÊ®°Ø\u009fSÚ¹\u009b<ì2*òÐ¤½é@ñÓ£".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                b = strArr;
                c = new String[2];
                x = new _2(j);
                return;
            }
            cCharAt = "\f\u0098\u0097Û\u008eú8\u0000\u0092\u000erLù×\u008b\u001e\u008f\u0002\u0083rÅ\u0011ÉV\u0090\u001c¹±\u00896\u0093\u009e§KU\u0095rAôuæÆ½pOÝìpZ\u000eÚ\u0092ºS8|D¹,gä7H\u0085`ä´)2¥\u0084¡2\u009fô\"Åû \u009cmØ\u0018o\u0004TJ'ó-ñ\u0099?*Z*õ¼\u001efÀ\u009bæòðÓ>Fò\u0016ó\u0004úÂaÈ¥mÑQ5²\u0099Á\u0082§mýÛ¯Ã\u008e&åöÚ¶¤ Æ²\u0096}\u000bùÇóÊ®°Ø\u009fSÚ¹\u009b<ì2*òÐ¤½é@ñÓ£".charAt(i3);
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 4637;
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
                throw new RuntimeException("su/catlean/_2", e);
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
            java.lang.String r1 = "su/catlean/_2"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._2.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
