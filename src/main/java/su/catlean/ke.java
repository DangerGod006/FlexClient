package su.catlean;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ke.class */
public final class ke extends _g {

    @NotNull
    public static final ke a;
    static final KProperty[] o;

    @NotNull
    private static final cs J;

    @NotNull
    private static final cs T;

    @NotNull
    private static final cs w;

    @NotNull
    private static final c8 y;

    @NotNull
    private static final Color x;

    @NotNull
    private static final List U;
    private static final long b = yz.a(-7616602262718149376L, -4904436483192952751L, MethodHandles.lookup().lookupClass()).a(195494187096868L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;

    /* JADX WARN: Illegal instructions before constructor call */
    private ke(long j) {
        long j2 = b ^ j;
        super((String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1306, 7158463278618855605L ^ j2) /* invoke-custom */, jt.F(), null, 4, null, j2 ^ 91674859979642L);
    }

    private final Color W(long j) {
        return (Color) J.E(this, (b ^ j) ^ 29522969800354L, o[0]);
    }

    private final Color Z(short s, short s2, int i) {
        return (Color) T.E(this, ((((((long) s) << 48) | ((((long) s2) << 48) >>> 16)) | ((((long) i) << 32) >>> 32)) ^ b) ^ 100744070729704L, o[1]);
    }

    private final Color a(long j) {
        return (Color) w.E(this, (b ^ j) ^ 6356652707349L, o[2]);
    }

    private final int I(long j) {
        return ((Number) y.E(this, (b ^ j) ^ 68358351172292L, o[3])).intValue();
    }

    @Override // su.catlean._g
    public void O(long j) {
        U.clear();
    }

    @Override // su.catlean._g
    public void b(long j) {
        U.clear();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x02d9: INVOKE (r-1 I:su.catlean.jl), (r0 I:java.awt.Color), (r1 I:long), (r2 I:java.awt.Color), (r3 I:float) VIRTUAL call: su.catlean.jl.C(java.awt.Color, long, java.awt.Color, float):java.awt.Color
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void I(su.catlean.api.event.events.client.TickEvent r22) {
        /*
            Method dump skipped, instruction units count: 1461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ke.I(su.catlean.api.event.events.client.TickEvent):void");
    }

    private final void t(long j) {
        long j2 = b ^ j;
        long j3 = j2 ^ 78028440560024L;
        int i = (int) (j2 >>> 48);
        int i2 = (int) ((j3 << 16) >>> 32);
        int i3 = (int) ((j3 << 48) >>> 48);
        long j4 = j2 ^ 72615728533979L;
        long j5 = j2 ^ 121641170648660L;
        class_243 class_243VarMethod_1019 = J((byte) (j2 >>> 56), ((j2 ^ 15310245248597L) << 8) >>> 8, (class_1297) zf.v(j5)).method_1019(zf.v(j5).method_18798().method_1021(10.0d));
        Intrinsics.checkNotNullExpressionValue(class_243VarMethod_1019, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27554, 4922000379779766420L ^ j2) /* invoke-custom */);
        U.add(new fw((float) (class_243VarMethod_1019.field_1352 + ((double) mf.D(j4, -48.0f, 48.0f, false, 4, null))), (float) (class_243VarMethod_1019.field_1351 + ((double) 4.0f) + ((double) mf.D(j4, -2.0f, 2.0f, false, 4, null))), (char) i, (float) (class_243VarMethod_1019.field_1350 + ((double) mf.D(j4, -48.0f, 48.0f, false, 4, null))), i2, (char) i3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0, (int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(769, 6239514669596015553L ^ j2) /* invoke-custom */, null));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0312: INVOKE (r-1 I:net.minecraft.class_4587), (r0 I:long), (r1 I:org.joml.Quaternionfc) STATIC call: su.catlean.m8.y(net.minecraft.class_4587, long, org.joml.Quaternionfc):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow(priority = -10)
    private final void c(su.catlean.api.event.events.render.Render3DEvent r16) {
        /*
            Method dump skipped, instruction units count: 884
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ke.c(su.catlean.api.event.events.render.Render3DEvent):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x0299: MOVE_MULTI in method: su.catlean.ke.h(su.catlean.g7, org.joml.Matrix4f, long, float, float, float, float, float, float):void, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ke.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:121)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Failed to decode insn: 0x0299: MOVE_MULTI
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:57)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	... 6 more
        Caused by: java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -3 out of bounds for object array[14]
        	at java.base/java.lang.System.arraycopy(Native Method)
        	at jadx.plugins.input.java.data.code.StackState.insert(StackState.java:52)
        	at jadx.plugins.input.java.data.code.CodeDecodeState.insert(CodeDecodeState.java:137)
        	at jadx.plugins.input.java.data.code.JavaInsnsRegister.dup2x1(JavaInsnsRegister.java:304)
        	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:50)
        	... 9 more
        */
    private final void h(su.catlean.g7 r1, org.joml.Matrix4f r2, long r3, float r5, float r6, float r7, float r8, float r9, float r10) {
        /*
            Method dump skipped, instruction units count: 1891
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ke.h(su.catlean.g7, org.joml.Matrix4f, long, float, float, float, float, float, float):void");
    }

    private final class_243 b(float f2, float f3, float f4, float f5, float f6, float f7, double d2) {
        double dSin = Math.sin(d2);
        double dCos = Math.cos(d2);
        float f8 = f2 - f5;
        float f9 = f4 - f7;
        return new class_243(((double) f5) + (((double) f8) * dCos) + (((double) f9) * dSin), ((double) f6) + ((double) (f3 - f6)), ((double) f7) + (((double) (-f8)) * dSin) + (((double) f9) * dCos));
    }

    static {
        int i;
        long j = b ^ 83953863487990L;
        long j2 = j ^ 89475063320185L;
        int i2 = (int) (j >>> 48);
        long j3 = ((j ^ 14157087000970L) << 16) >>> 16;
        long j4 = j ^ 70870467127223L;
        int i3 = (int) (j >>> 48);
        int i4 = (int) ((j4 << 16) >>> 32);
        int i5 = (int) ((j4 << 48) >>> 48);
        long j5 = j ^ 68233247023701L;
        e = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i6 = 1; i6 < 8; i6++) {
            bArr[i6] = (byte) ((j << (i6 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[22];
        int i7 = 0;
        String str = "}\u0001ôÉ\u0091»\u0088ÀkO\u009cÄ ^Ðæo\f \u0086L[Iè°\u0004º³d\u0085ãÊ\u0086PzÅ%'Ñ\u0018¾\u0089kNE\u0087\u0088ÝÉâúI\t}\u0092$uz\u009c¶µ\f\u0087\u0016\u0018Ä%c\u001bØ\u0014$\u0085fÏ_Ò¼1\u0003ù \u0019½.\u0088ÑßÁ få\u000b\u0097ÒQv\u000bna\u001eú\r\u0090øÉÅ\u007fB\u0089Æ6AS²\u0094|\u001eÃ¤ñ0 Û°[«;1KAæûjù\u0006 -\u0004¡\u001b\u008f¿\u001a/þ¡g\u008b.7\u008eÏà\u0017\u0010P0\u001a\u0096+X\u009aú'},Í;¤¦Ù òÝÈñÒãR;zÂòH_`$\r]\u0085\u0006Ö\u0010\u0019\u008d2Ëá&\u0099ÐwÆ1\u00104_\u0005Ñ>ûFe\bÿsõ\bË\"È\u0018°±&«\b\u0011û\u008d\u008f}5\u0001\u0012ßÁÍ2D½ç÷UÃ\u008c\u00100\u0007aÞ#c¤æ\u00950b-\u0016\u0007Ã\u0097  \u000efíºõæH±\u0089\u0006#&IæE.©l3Üà\u009cq[;ß\u008bQÆP]\u0018\u0013\u0013\u009c \u0013¦û\u0098jcPÎÅÌGPÀÊnØðpd\u008c\u0010\u009cÿfWUz Ûz\u000b\f#Cò=o\u0010\u008aâ\u0006ÚN(=\u0099\nhFÄ×î\u0011â\u0018H#ò1\u0011ñàç\u0084¥u©{íÝ5\u0017\u009fã\u0002åXô¥\u0010\u008aR\u0085\tê¦É\u000f|ïõÚ\u0011@\u001d~\u0010\u001d}¥~\u0014\u0092û\u0017ÖÉCH\u0001`Ù\\\u0018R\r9.?d\u000425W\u0090(\u0087Ðhä×´úÓÈ,Ñm \u008f¶/\u00adÀ¤Ý³°\u001cÁIgóm,tÂðfJT¡\u0085\u0084¡w\u0091d\u000bÓ\u008c(å\u001d\u0089&\u0002M\u0016\n)\r\u0010\rþ\u0017HfU3\u0017Ë¤d\u0090\u000b\u0017¸:\u0084¾\u0017ÈÄ\u0012\u0094¹\\\u00178\u0083¥ \u0001Ý\u0080ìÛ\u0081ØA\rA$ëÊ\u0082|Ù\u008f\u0090Ww;0YÚ\u0082=\u0090é\u008bªÆ«";
        int length = "}\u0001ôÉ\u0091»\u0088ÀkO\u009cÄ ^Ðæo\f \u0086L[Iè°\u0004º³d\u0085ãÊ\u0086PzÅ%'Ñ\u0018¾\u0089kNE\u0087\u0088ÝÉâúI\t}\u0092$uz\u009c¶µ\f\u0087\u0016\u0018Ä%c\u001bØ\u0014$\u0085fÏ_Ò¼1\u0003ù \u0019½.\u0088ÑßÁ få\u000b\u0097ÒQv\u000bna\u001eú\r\u0090øÉÅ\u007fB\u0089Æ6AS²\u0094|\u001eÃ¤ñ0 Û°[«;1KAæûjù\u0006 -\u0004¡\u001b\u008f¿\u001a/þ¡g\u008b.7\u008eÏà\u0017\u0010P0\u001a\u0096+X\u009aú'},Í;¤¦Ù òÝÈñÒãR;zÂòH_`$\r]\u0085\u0006Ö\u0010\u0019\u008d2Ëá&\u0099ÐwÆ1\u00104_\u0005Ñ>ûFe\bÿsõ\bË\"È\u0018°±&«\b\u0011û\u008d\u008f}5\u0001\u0012ßÁÍ2D½ç÷UÃ\u008c\u00100\u0007aÞ#c¤æ\u00950b-\u0016\u0007Ã\u0097  \u000efíºõæH±\u0089\u0006#&IæE.©l3Üà\u009cq[;ß\u008bQÆP]\u0018\u0013\u0013\u009c \u0013¦û\u0098jcPÎÅÌGPÀÊnØðpd\u008c\u0010\u009cÿfWUz Ûz\u000b\f#Cò=o\u0010\u008aâ\u0006ÚN(=\u0099\nhFÄ×î\u0011â\u0018H#ò1\u0011ñàç\u0084¥u©{íÝ5\u0017\u009fã\u0002åXô¥\u0010\u008aR\u0085\tê¦É\u000f|ïõÚ\u0011@\u001d~\u0010\u001d}¥~\u0014\u0092û\u0017ÖÉCH\u0001`Ù\\\u0018R\r9.?d\u000425W\u0090(\u0087Ðhä×´úÓÈ,Ñm \u008f¶/\u00adÀ¤Ý³°\u001cÁIgóm,tÂðfJT¡\u0085\u0084¡w\u0091d\u000bÓ\u008c(å\u001d\u0089&\u0002M\u0016\n)\r\u0010\rþ\u0017HfU3\u0017Ë¤d\u0090\u000b\u0017¸:\u0084¾\u0017ÈÄ\u0012\u0094¹\\\u00178\u0083¥ \u0001Ý\u0080ìÛ\u0081ØA\rA$ëÊ\u0082|Ù\u008f\u0090Ww;0YÚ\u0082=\u0090é\u008bªÆ«".length();
        char cCharAt = '@';
        int i8 = -1;
        while (true) {
            int i9 = i8 + 1;
            String strSubstring = str.substring(i9, i9 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i10 = i7;
                        i7++;
                        strArr[i10] = strIntern;
                        int i11 = i9 + cCharAt;
                        i = i11;
                        if (i11 < length) {
                            cCharAt = str.charAt(i);
                        } else {
                            c = strArr;
                            d = new String[22];
                            h = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i12 = 1; i12 < 8; i12++) {
                                bArr2[i12] = (byte) ((j << (i12 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[14];
                            int i13 = 0;
                            String str3 = "\u001eþÓ\u0082\u0004\u00130R>\tQÎ\u00ad²x 9§Ì\u0005\u000b\u0012ÕÚú)Ä\u009f\u0081!W1¬ê.Uxâ\u0081Â»4ÅN£'\u008e\u008f\u0093\u0089'#^Ô±ç[õk/ ò£íD\u0087¾±¥<\u008bNÇ\"²]6\u007f?Ö£æbÚ±´Ýæ®\u008c\u001et.u\t\u0094";
                            int length2 = "\u001eþÓ\u0082\u0004\u00130R>\tQÎ\u00ad²x 9§Ì\u0005\u000b\u0012ÕÚú)Ä\u009f\u0081!W1¬ê.Uxâ\u0081Â»4ÅN£'\u008e\u008f\u0093\u0089'#^Ô±ç[õk/ ò£íD\u0087¾±¥<\u008bNÇ\"²]6\u007f?Ö£æbÚ±´Ýæ®\u008c\u001et.u\t\u0094".length();
                            int i14 = 0;
                            while (true) {
                                int i15 = i14;
                                i14 += 8;
                                byte[] bytes = str3.substring(i15, i14).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i16 = i13;
                                i13++;
                                long j6 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j7 = j6;
                                    int i17 = i16;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j7 >>> 56), (byte) (j7 >>> 48), (byte) (j7 >>> 40), (byte) (j7 >>> 32), (byte) (j7 >>> 24), (byte) (j7 >>> 16), (byte) (j7 >>> 8), (byte) j7});
                                    long j8 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i17) {
                                        case 0:
                                            jArr2[b5] = j8;
                                            if (i14 >= length2) {
                                                f = jArr;
                                                g = new Integer[14];
                                                o = new KProperty[]{Reflection.property1(new PropertyReference1Impl(ke.class, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17645, 1513937527599587132L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27586, 3099787624853860359L ^ j) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(ke.class, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12466, 827239222720211822L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19700, 8233115062292567856L ^ j) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(ke.class, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3535, 1610316614182704652L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3931, 7394922650579113099L ^ j) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(ke.class, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17640, 3662545805247962934L ^ j) /* invoke-custom */, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29119, 68897302105057898L ^ j) /* invoke-custom */, 0))};
                                                a = new ke(j5);
                                                ke keVar = a;
                                                short s = (short) i2;
                                                String strG = (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21792, 7140014324701023991L ^ j) /* invoke-custom */;
                                                Color color = Color.YELLOW;
                                                Intrinsics.checkNotNullExpressionValue(color, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29344, 7662947501904685439L ^ j) /* invoke-custom */);
                                                J = yp.b(keVar, s, strG, color, null, null, (int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23409, 5708160522698099534L ^ j) /* invoke-custom */, null, j3);
                                                ke keVar2 = a;
                                                short s2 = (short) i2;
                                                String strG2 = (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12801, 6677547391922514389L ^ j) /* invoke-custom */;
                                                jl jlVar = jl.y;
                                                Color color2 = Color.YELLOW;
                                                Intrinsics.checkNotNullExpressionValue(color2, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5034, 7200326011057703026L ^ j) /* invoke-custom */);
                                                T = yp.b(keVar2, s2, strG2, jlVar.p(color2, (char) i3, i4, 0.2f, (short) i5), null, null, (int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23409, 5708160522698099534L ^ j) /* invoke-custom */, null, j3);
                                                ke keVar3 = a;
                                                short s3 = (short) i2;
                                                String strG3 = (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10072, 7161072360314616961L ^ j) /* invoke-custom */;
                                                jl jlVar2 = jl.y;
                                                Color color3 = Color.ORANGE;
                                                Intrinsics.checkNotNullExpressionValue(color3, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10198, 1427450186624154637L ^ j) /* invoke-custom */);
                                                w = yp.b(keVar3, s3, strG3, jlVar2.p(color3, (char) i3, i4, 0.2f, (short) i5), null, null, (int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23409, 5708160522698099534L ^ j) /* invoke-custom */, null, j3);
                                                y = yp.L(a, (String) b(MethodHandles.lookup(), "g", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32138, 3540296664536573532L ^ j) /* invoke-custom */, (int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19827, 7869483022346132813L ^ j) /* invoke-custom */, new IntRange(0, (int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16251, 7260554602083544907L ^ j) /* invoke-custom */), j2, null, null, (int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(588, 5938596296707920504L ^ j) /* invoke-custom */, null);
                                                x = new Color((int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14178, 1315062714977249113L ^ j) /* invoke-custom */, (int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1854, 3592399614308964105L ^ j) /* invoke-custom */, (int) c(MethodHandles.lookup(), "x", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1854, 3592399614308964105L ^ j) /* invoke-custom */);
                                                U = new ArrayList();
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j8;
                                            if (i14 >= length2) {
                                                str3 = "\u0097ÖÑFDû\u00189I\t³µ>ô¨\u009c";
                                                length2 = "\u0097ÖÑFDû\u00189I\t³µ>ô¨\u009c".length();
                                                i14 = 0;
                                            }
                                            break;
                                    }
                                    int i18 = i14;
                                    i14 += 8;
                                    byte[] bytes2 = str3.substring(i18, i14).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i16 = i13;
                                    i13++;
                                    j6 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i19 = i7;
                        i7++;
                        strArr[i19] = strIntern;
                        int i20 = i9 + cCharAt;
                        i8 = i20;
                        if (i20 < length) {
                        }
                        str = "¾8äçH\u0090â\u0082üFÑÆ3v7¨\n%¹«\u001ePÆ\fý9Z¤×F3\u0086\u0011Hzja\rÂ9UB8W\u009e\u0099Î¾\u009b\u001a°â\"\u0090²é8\u009eF\\àÄ\u008bSø¦Øv\u0087ÒÄ\u0017qD²ü\u0007ú¶F#\u0085=\u009b£\u008eM\u0001)5±\u009f\u0098:mÇ\u00026\u0015¢9\u009að®ØÞ<µ\u0082o¦\u0095\u001f";
                        length = "¾8äçH\u0090â\u0082üFÑÆ3v7¨\n%¹«\u001ePÆ\fý9Z¤×F3\u0086\u0011Hzja\rÂ9UB8W\u009e\u0099Î¾\u009b\u001a°â\"\u0090²é8\u009eF\\àÄ\u008bSø¦Øv\u0087ÒÄ\u0017qD²ü\u0007ú¶F#\u0085=\u009b£\u008eM\u0001)5±\u009f\u0098:mÇ\u00026\u0015¢9\u009að®ØÞ<µ\u0082o¦\u0095\u001f".length();
                        cCharAt = '8';
                        i = -1;
                        break;
                        break;
                }
                i9 = i + 1;
                strSubstring = str.substring(i9, i9 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i8);
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 24093;
        if (d[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) e.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i2] = b(((Cipher) objArr[0]).doFinal(c[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/ke", e2);
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
            r1 = r8
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
            java.lang.String r1 = "su/catlean/ke"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ke.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 5630;
        if (g[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) f[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) h.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/ke", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            g[i2] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return g[i2].intValue();
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
            r1 = r8
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
            java.lang.String r1 = "su/catlean/ke"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ke.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
